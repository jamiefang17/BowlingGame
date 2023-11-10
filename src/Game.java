// code
public class Game
{
// other code ...
public int score(int[] _rolls) {
int score = 0;
int roll = 0;
for (int frame = 0; frame < 10; frame++) {
if (isSpareFrame(roll)) {
score += 10 + _rolls[roll + 2];
} else {
score += _rolls[roll] + _rolls[roll + 1];
}
roll += 2;
}
return score;
}
private boolean isSpareFrame(int roll) {
    return false;
}
public void roll(int i) {
}
public Object score() {
	return null;
}

}