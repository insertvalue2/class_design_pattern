package ch02;

// Taget, 인터페이스로 설계
interface IElectronic220v {
    void connect();
}

interface IElectronic110v {
    void connect();
}

// 일본에서 선물 받은 헤어 드라이기
class HairDryer implements IElectronic110v {

    @Override
    public void connect() {
        System.out.println("헤어드라이기 연결 110v On");
    }
}

class AirConditioner implements IElectronic220v {
    @Override
    public void connect() {
        System.out.println("에어컨 연결 연결 220v On");
    }
}

// 어댑터 패턴에 핵심 -
class ElectronicAdapter implements IElectronic220v {

    IElectronic110v iElectronic110v;

    // 생성자를 통해서 연결할 가전제품(즉, 110v 을 전달 받습니다)
    public ElectronicAdapter(IElectronic110v iElectronic110v) {
        this.iElectronic110v = iElectronic110v;
    }

    // 외부적으로 220v 을 연결 시킬 수 있음 (내부에서 사실 110v 이 연결된 상태 입니다)
    @Override
    public void connect() {
        iElectronic110v.connect();
    }
}



// 우리집 : 클리언트
public class MyHouse {

    // 220v 콘센트를 연결하는 메서드
    public static void plugIn(IElectronic220v iElectronic220v) {
        iElectronic220v.connect();
    }


    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        HairDryer hairDryer = new HairDryer();

        ElectronicAdapter electronicAdapterHairDryer = new ElectronicAdapter(hairDryer);

        // 나는 전기 설비가 되어 있어 (집)
        plugIn(airConditioner); // 에어컨 연결 완료
        plugIn(electronicAdapterHairDryer);
    }

}


