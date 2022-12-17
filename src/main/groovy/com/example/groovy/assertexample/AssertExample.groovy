package com.example.groovy.assertexample

import groovy.transform.CompileStatic
import org.codehaus.groovy.runtime.DefaultGroovyMethods
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter
import org.codehaus.groovy.runtime.powerassert.AssertionRenderer
import org.codehaus.groovy.runtime.powerassert.PowerAssertionError
import org.codehaus.groovy.runtime.powerassert.ValueRecorder

@CompileStatic
class AssertExample {
  String firstName

  void printFirstNameWhenNotNull() {
    assert firstName != null
    println firstName
  }

  void printFirstNameWhenNotNull_likeGenerated() {
    ValueRecorder var1 = new ValueRecorder();

    String var10000;
    try {
      var10000 = this.firstName;
      var1.record(var10000, 8);
      var1.record(var10000, 8);
      if (var10000 != null) {
        var1.clear();
      } else {
        ScriptBytecodeAdapter.assertFailed(AssertionRenderer.render("assert firstName != null", var1), (Object)null);
      }
    } catch (Throwable var3) {
      var1.clear();
      throw var3;
    }

    DefaultGroovyMethods.println(this, this.firstName);
    var10000 = null;
  }

  void printFirstNameWhenNotNull_likeGenerated_fixed() {
    ValueRecorder var1 = new ValueRecorder();

    String var10000;
    try {
      var10000 = this.firstName;
      var1.record(var10000, 8);
      var1.record(var10000, 8);
      if (var10000 != null) {
        var1.clear();
      } else {
        Throwable throwable = createAssertionError(AssertionRenderer.render("assert firstName != null", var1), (Object)null);
        throw throwable
      }
    } catch (Throwable var3) {
      var1.clear();
      throw var3;
    }

    DefaultGroovyMethods.println(this, this.firstName);
    var10000 = null;
  }

  void printFirstNameWhenNotNullAndNotBlank() {
    assert firstName != null && !firstName.isBlank()
    println firstName
  }

  void printFirstNameWhenNotNullAndNotBlank_likeGenerated() {
    ValueRecorder var1 = new ValueRecorder();

    String var10000;
    try {
      boolean var4;
      var10000 = this.firstName;
      var1.record(var10000, 8);
      var1.record(var10000, 8);
      if (var10000 != null) {
        var10000 = this.firstName;
        var1.record(var10000, 30);
        var1.record(var10000, 30);
        var4 = var10000.isBlank();
        var1.record(var4, 40);
        if (!var4) {
          var4 = true;
        }
        else {
          var4 = false;
        }
      }
      else {
        var4 = false;
      }

      var1.record(var4, 26);
      if (var4) {
        var1.clear();
      } else {
        ScriptBytecodeAdapter.assertFailed(AssertionRenderer.render("assert firstName != null && !firstName.isBlank()", var1), (Object)null);
      }
    } catch (Throwable var3) {
      var1.clear();
      throw var3;
    }

    DefaultGroovyMethods.println(this, this.firstName);
    var10000 = null;
  }

  void printFirstNameWhenNotNullAndNotBlank_likeGenerated_fixed() {
    ValueRecorder var1 = new ValueRecorder();

    String var10000;
    try {
      boolean var4;
      var10000 = this.firstName;
      var1.record(var10000, 8);
      var1.record(var10000, 8);
      if (var10000 != null) {
        var10000 = this.firstName;
        var1.record(var10000, 30);
        var1.record(var10000, 30);
        var4 = var10000.isBlank();
        var1.record(var4, 40);
        if (!var4) {
          var4 = true;
        }
        else {
          var4 = false;
        }
      }
      else {
        var4 = false;
      }

      var1.record(var4, 26);
      if (var4) {
        var1.clear();
      } else {
        Throwable throwable = createAssertionError(AssertionRenderer.render("assert firstName != null && !firstName.isBlank()", var1), (Object)null);
        throw throwable
      }
    } catch (Throwable var3) {
      var1.clear();
      throw var3;
    }

    DefaultGroovyMethods.println(this, this.firstName);
    var10000 = null;
  }

  public static AssertionError createAssertionError(Object expression, Object message) {
    if (message == null || "".equals(message)) {
      return new PowerAssertionError(expression.toString());
    }
    return new AssertionError((Object)("" + message + ". Expression: " + expression));
  }
}
