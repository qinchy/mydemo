package com.qinchy;

import com.qinchy.annotation.Hint;
import com.qinchy.annotation.Hints;

@Hint("hint1")
@Hint("hint2")
class Person {
}

@Hints({@Hint("hint1"), @Hint("hint2")})
class Animal {
}