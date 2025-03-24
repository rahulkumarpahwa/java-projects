# Typing Speed Master

## Version 1.0

1. The TypingSpeed class provides a simple typing speed test.
2. It displays a countdown and then shows a random word from a predefined list.

### Features:

1. Countdown before starting the typing test.
2. Random word generation from a predefined list of words.
3. Calculation of typing speed in words per minute (WPM).
4. Capturing user input and measuring elapsed time.

### Steps:

1. Displays a countdown from 3 to 1.
2. Generates and displays 10 random words from a predefined list.
3. Records the start time.
4. Captures the user's input.
5. Records the end time.
6. Calculates the elapsed time in seconds.
7. Calculates the typing speed in words per minute (WPM).

### Example output:

```java
Welcome to Typing Speed Master!
3
2
1
apple banana cherry date elderberry fig grape honeydew kiwi lemon
[User types the words]
Your WPM is 45!
```
## Version 1.1

### Newly Added Features:

1. Highlighting errors in the user's input.
2. Calculating and displaying the accuracy of the user's typing.
3. Storing and displaying the leaderboard with WPM and accuracy.

## Steps:
8. Highlights errors in the user's input.
9. Calculates the accuracy of the user's typing.
10. Displays the user's input, typing speed, and accuracy.
11. Prompts the user to enter their name and adds the score to the leaderboard.
12. Displays the updated leaderboard.

### Example output:
```java
Welcome to Typing Speed Master!
3
2
1
apple banana cherry date elderberry fig grape honeydew kiwi lemon
[User types the words]
Your input with errors highlighted: apple [banan] cherry date elderberry fig grape honeydew kiwi lemon
Your WPM is 45!
Your accuracy is 90.00%
Enter your name: John
Leaderboard:
1. John: 45 WPM, 90.00% Accuracy
```