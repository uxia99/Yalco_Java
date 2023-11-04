package sec06.chap02.pkg1;

public class Friend {
    //  Parent와 같은 패키지
    Parent parent = new Parent();

    // int aa = new Parent().a; // ⚠️ 불가
    int bb = parent.b; // 자식클래스가 아니기 때문에 그냥 가져다쓰지는 못하고, 인스턴스를 만든 후 끌어다 사용 가능
    int cc = parent.c; // 💡 protected - 같은 패키지, 비 상속관계
    int dd = parent.d;
}
