// code
public class Game
{
    private int[] _rolls = new int[21];
    private int _turn = 0;
    public void roll(int pins) {
    _rolls[_turn++] = pins;
    }
    
public int score() {
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
return _rolls[roll] + _rolls[roll + 1] == 10;
}
}