package exercises.microblog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicroBlogTest {

    private MicroBlog microBlog;

    @BeforeEach
    public void setUp() {
        microBlog = new MicroBlog();
    }

    @DisplayName("English language short")
    @Test
    public void testEnglishLanguageShort() {
        assertEquals("Hi", microBlog.truncate("Hi"));
    }

    @DisplayName("English language long")
    @Test
    public void testEnglishLanguageLong() {
        assertEquals("Hello", microBlog.truncate("Hello there"));
    }

    @DisplayName("German language short")
    @Test
    public void testGermanLanguageShort() {
        assertEquals("brühe", microBlog.truncate("brühe"));
    }

    @DisplayName("German language long")
    @Test
    public void testGermanLanguageLong() {
        assertEquals("Bärte", microBlog.truncate("Bärteppuch"));
    }

    @DisplayName("Bulgarian language short")
    @Test
    public void testBulgarianLanguageShort() {
        assertEquals("Добър", microBlog.truncate("Добър"));
    }

    @DisplayName("Greek language short")
    @Test
    public void testGreekLanguageShort() {
        assertEquals("υγειά", microBlog.truncate("υγειά"));
    }

    @DisplayName("Maths short")
    @Test
    public void testMathsShort() {
        assertEquals("a=πr²", microBlog.truncate("a=πr²"));
    }

    @DisplayName("Maths long")
    @Test
    public void testMathsLong() {
        assertEquals("∅⊊ℕ⊊ℤ", microBlog.truncate("∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ"));
    }

    @DisplayName("English language and emoji short")
    @Test
    public void testEnglishLanguageAndEmojiShort() {
        assertEquals("Fly \uD83D\uDEEB",  microBlog.truncate("Fly \uD83D\uDEEB"));
    }

    @DisplayName("Emoji short")
    @Test
    public void testEmojiShort() {
        assertEquals("\uD83D\uDC87",   microBlog.truncate("\uD83D\uDC87"));
    }

    @DisplayName("Emoji long")
    @Test
    public void testEmojiLong() {
        assertEquals("❄\uD83C\uDF21\uD83E\uDD27\uD83E\uDD12\uD83C\uDFE5", microBlog.truncate("❄\uD83C\uDF21\uD83E\uDD27\uD83E\uDD12\uD83C\uDFE5\uD83D\uDD70\uD83D\uDE00"));
    }
}
