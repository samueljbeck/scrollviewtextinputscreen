# ScrollViewTextInput
Here is a solution for text input hidden behind the soft keyboard.  This solution allows text and buttons to be scrolled up from behind the keyboard.


### Workings
In Kotlin class TextInputActivity the holder is expanded to be the size of the screen then all the text input is pushed to the bottom of the screen.

With the LockableScrollView the text can be scrolled up to continue text input or press the Login button.

