package edu.pdx.cs410J.roper;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class KataTest extends InvokeMainTestCase

{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void runMain() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "z");
    assertThat(result.getTextWrittenToStandardError(), containsString("command line argument must be a character between a-r"));
  }

  @Test
  public void completeMain() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "h");
  }

}
