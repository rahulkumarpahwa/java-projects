## Word Counter

- The TypingSpeed class provides a simple typing speed test.
- It displays a countdown and then shows a random word from a predefined list.
-
- This class uses the following features:
- - Countdown before starting the typing test
- - Random word generation from a predefined list of words
- - Calculation of typing speed in words per minute (WPM)
- - Capturing user input and measuring elapsed time
-
- Usage example:
-
- ```java

  ```
- TypingSpeed.main(new String[]{});
- ```

  ```
-
- Note: This class requires the java.util.concurrent.TimeUnit, java.time.LocalTime, java.util.Random, and java.util.Scanner packages.
-
- Steps:
- 1.  Displays a countdown from 3 to 1.
- 2.  Generates and displays 10 random words from a predefined list.
- 3.  Records the start time.
- 4.  Captures the user's input.
- 5.  Records the end time.
- 6.  Calculates the elapsed time in seconds.
- 7.  Calculates the typing speed in words per minute (WPM).
- 8.  Displays the user's input and typing speed.
-
- Example output:
-
- ```java

  ```
- Welcome to Typing Speed Master!
- 3
- 2
- 1
- apple banana cherry date elderberry fig grape honeydew kiwi lemon
- [User types the words]
- Your wpm is [calculated WPM]!
- ```

  ```
-
- Author: Rahul Kumar
- Version: 1.0
  \*/
