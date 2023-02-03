package 게임만들기;

public class Character extends Unit implements GameAction {
    // name : 캐릭터 이름
    // pP : 물리 힘
    // mP : 마법 힘
    // pH : 물리 적중률
    // mH : 마법 적중률
    // ultra : 특수 기술에 대한 공격력
    // hp : 체력
    public Character(String name, int pP, int mP, double pH,  double mH, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }

    @Override
    public double pAttack() { // 물리공력에 대한 기능 구현
        return pPower * pHit;
    }

    @Override
    public double mAttack() { // 마법공격에 대한 기능 구현
        return mPower * mHit;
    }

    @Override
    public int ultimate() { // 궁극기
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false; // 캐릭터가 살아 있음
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }
}
