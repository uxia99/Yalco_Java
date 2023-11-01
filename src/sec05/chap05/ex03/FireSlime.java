package sec05.chap05.ex03;

public class FireSlime extends Slime {
    private int fireAttack = 4;

    @Override
    public void attack (Slime enemy) {
        enemy.hp -= (attack + fireAttack) * (1 - enemy.defense);
    }
}

// 부모 클래스에 생성자가 없는 경우 자식 클래스에서도 생성자를 작성해줄 필요 없음