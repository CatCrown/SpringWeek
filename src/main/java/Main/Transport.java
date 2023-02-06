package Main;
public abstract class Transport {

    private int number;
    private int oil; // 주유량
    private int speed; // 속도
    private String status; //상태
    private int MaxClient; //최대 승객수


    public Transport() {
        oil = 100;
        speed = 0;
        status = "운행";
    }

    public int getNumber() {// 버스번호
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOil() {   //주유략
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getSpeed() {   //속도
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxClient() {//최대승객수
        return MaxClient;
    }

    public void setMaxClient(int MaxClient) {
        this.MaxClient = MaxClient;
    }

    public String getStatus() {// 운행상태
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

