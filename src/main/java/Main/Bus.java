package Main;
public class Bus extends Transport {
    private int price;/* 요금 */
    private int client; //현재 버스에 탑승한 승객수

    public int getPrice(){// 요금
        return price ;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getClient(){//최대승객수
        return client ;
    }
    public void setClient(int client){
        this.client = client;
    }
    public Bus(){
        super();
//        this.setNumber(getNumber());// 버스번호 초기화
        this.setOil(100);
        this.setStatus("운행");
        this.setMaxClient(30); // 최대 승객수 초기화
        this.setPrice(1000);  // 요금 초기화
//        this.setTotalPrice(0);
        this.setClient(0); //현재 버스에 탑승한 승객수 초기화

        System.out.println(this.getNumber() + "번 버스객체 만들어짐");
    }
    public void AddClient(int num) { //승객 추가
        if (this.getClient() + num < this.getMaxClient()) {
            this.client += num;
            System.out.println("탑승 승객 수 = " + num);
            System.out.println("잔여 승객 수 =  " + (this.getMaxClient()-this.getClient()) );
            System.out.println("요금 = " + this.price * num);
        } else {
            System.out.println("최대 승객를 초과했습니다.");
            setStatus("차고지행");
        }
    }

    public void AddOil(int num) { //주유량 변경
        if (this.getOil()+num <= 50){
            this.setStatus("차고지행");
        }else{
            this.setStatus("운행중");
        }
        this.setOil(this.getOil()+num);
        System.out.println("주유량 = " + this.getOil());
        System.out.println("상태 = " + this.getStatus());

        if(this.getOil()<10){
            System.out.println("주유가 필요합니다.");
        }
    }
}
