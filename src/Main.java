public class Main{
    public static void main(String[] args){
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        b1.setNumber(100);
        b2.setNumber(200);
        b1.addClient(2);//승객 추가
        b1.changeOil(-50);//주유량 변경
        b1.changeOil(10);//주유량 변경
        b1.addClient(45);//승객 추가
        b1.addClient(5);//승객 추가
        b1.changeOil(-55);//주유량 변경

    }
}
public abstract class Transport {//상위클래스 대중교통
    //캡술화와 접근 제어자 사용 페이지 245
    private int number;//번호
    private int oil;// 주유량 기본값
    private int speed;// 속도 기본값
    private int MaxClient; // 최대승객수
    private boolean status ; //주행상태

//    public transport(){
//        this.oil = 100; //주유량 초기값
//        this.speed =0; //  속도 초기값
//    }

    // get방식은 리소스 조회
    public int getNumber(){// get방식은 리소스 조회
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getOil(){ //주유략
        return oil ;
    }
    public void setOil(int oil){
        this.oil = oil;
    }
    public int getSpeed(){ //주유략
        return speed ;
    }
    public void setSpeed(int oil){
        this.speed = oil;
    }
    public int getMaxClient(){//최대승객수
        return MaxClient ;
    }
    public void setMaxClient(int MaxClient){
        this.MaxClient = MaxClient;
    }

    public boolean getStatus(){// 운행상태
        return status ;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

}
public class Bus extends Transport {
    private int price;//요금
    private int totalPrice; // 총 요금
    private int client; //현재 버스에 탑승한 승객수
    public int getPrice(){// 요금
        return price ;
    }
    public void setPrice(int price){
        this.price = price;
    }
//    public int getTotalPrice(){// 요금
//        return totalPrice ;
//    }
//    public void setTotalPrice(int totalPrice){
//        this.totalPrice = totalPrice;
//    }

    public int getClient(){// 현재 버스에 탑승한 승객수
        return client ;
    }
    public void setClient(int client){
        this.client = client;
    }
    public Bus(int number){//버스는 번호를 가져야 한다.
        super();
        this.setNumber(number);// 버스번호 초기화
        this.setOil(100);
        this.setS(0);
        this.setMaxClient(30); // 최대 승객수 초기화
        this.setStatus(true); // 운행 상태 초기화 true는  운행시작
        this.setPrice(1000);  // 요금 초기화
//        this.setTotalPrice(0);
        this.setClient(0); //현재 버스에 탑승한 승객수 초기화

        System.out.println(number + "번 버스객체 만들어짐");
    }

    public void addClient(int num){
        int tmp = this.getClient() + num;
        if(tmp> this.getMaxClient()){
            System.out.println("최대승객수 초과");
        }else{
            System.out.println("탑승 승객 수 = "+ num);
            System.out.println("잔여 승객 수 = " + (this.getMaxClient()-tmp));
            System.out.println("요금 확인 = "+ num * getPrice());
            return setClient(tmp);
        }


    }
    public void changeOil(int num){
        int tmp = getOil() + num; //남은 주유량
        if(tmp<=50) {
            setStatus(false);//차고지행으로 변경
            System.out.println("주유량: " + tmp);
            System.out.println("상태: 차고지행");
        }else{
            setStatus(true);//운행중
            System.out.println("주유량: " + tmp);
        }
        if(tmp<10){
            System.out.println("주유가 필요합니다");
        }
        return setOil(tmp);
    }



}
