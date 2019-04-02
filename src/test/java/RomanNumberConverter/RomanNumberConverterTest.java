package RomanNumberConverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

  RomanNumberConverter romanNumberConverter;

  @Before
  public void setup() {
    romanNumberConverter = new RomanNumberConverter();
  }

  @Test
  public void checkConvert() {
    assertThat(romanNumberConverter.convert("V"))
      .isEqualTo(5);
    assertThat(romanNumberConverter.convert("I"))
      .isEqualTo(1);
    assertThat(romanNumberConverter.convert("X"))
      .isEqualTo(10);
  }



  @Test
  public void check_nullConvert() {
    assertThatThrownBy(() -> romanNumberConverter.convert(null))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("number cannot be null");
  }
}
