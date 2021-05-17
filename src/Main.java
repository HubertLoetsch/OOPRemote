    //Autor Hubert Lötsch
    //Version v.0.9
    public class Main {
        public static void main(String[] args) {

            Battery b1 = new Battery(3.5);
            Battery b2 = new Battery(3.5);

            RemoteControl rC = new RemoteControl();

            rC.setBatteries(b1, b2);
            rC.setOn(true);

            System.out.println(rC.getStatus());
            rC.selectChannel(5);

            System.out.println(rC.getStatus());
            rC.selectChannel(5);

            System.out.println(rC.getStatus());


            rC.setBattery1(new Battery(3.5));

            System.out.println(rC.getStatus());


        }
    }
