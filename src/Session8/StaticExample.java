package Session8;

public class StaticExample {

        static class Config {
            static int defaultValue;

            static {
                defaultValue = 100;
            }


            public int getDefaultValue() {
                return defaultValue;
            }
public void setDefaultValue(int value) {
                defaultValue = value;
            }
        }

        public static void main(String[] args) {
            Config c1 = new Config();
            Config c2 = new Config();
            Config c3 = new Config();
            System.out.println(c1.getDefaultValue());
            c2.setDefaultValue(200);
            c3.setDefaultValue(300);
            System.out.println(c1.getDefaultValue());

    }
    }
