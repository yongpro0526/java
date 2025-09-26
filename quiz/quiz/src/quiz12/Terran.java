//package quiz12;
//
//public abstract class Terran {
//    private int x = 0;
//    private int y = 0;
//    private int hp;
//    private int armor = 0;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
//    public int getArmor() {
//        return armor;
//    }
//
//    public void setArmor(int armor) {
//        this.armor = armor;
//    }
//
//    abstract class Unit extends Terran {
//
//        public Unit(int hp, int armor) {
//            this.setHp(hp);
//            this.setArmor(armor);
//        }
//        public abstract void location();
//        public abstract void move(int x, int y);
//        public abstract void stop();
//    }
//
//    abstract class Infantry extends Unit {
//        public Infantry(int hp, int armor) {
//            super(hp, armor);
//        }
//
//        void upgradeInfantryArmor(int uia) {
//            armor += uia;
//            System.out.println("보병유닛의 방어력이 업그레이드 되었습니다.");
//        }
//    }
//
//    abstract class weaponInfantry extends Unit {
//        int attack;
//        public weaponInfantry(int hp, int attack, int armor) {
//            super(hp, armor);
//            this.attack = attack;
//        }
//        void upgradeInfantryWeapon(int uiw) {
//            attack += uiw;
//            System.out.println("보병유닛의 공격력이 업그레이드 되었습니다.");
//        }
//    }
//
//    abstract class noWeaponInfantry extends Unit {
//        public noWeaponInfantry(int hp, int armor) {
//            super(hp, armor);
//        }
//    }
//
//    public class Marine extends weaponInfantry {
//        public Marine() {
//            super(40,6, 0);
//        }
//        public void location() {
//            System.out.println("현재위치: " + getX() + ", " + getY());
//        }
//        public void move(int x, int y) {
//            System.out.println("이동: " + getX() + x + ", " + getY() + y);
//        }
//        public void stop() {
//            System.out.println("정지");
//        }
//    }
//
//    class Firebat extends weaponInfantry {
//        public Firebat() {
//            super(50,8, 1);
//        }
//    }
//
//    class Ghost extends weaponInfantry {
//        public Ghost() {
//            super(45,10, 0);
//        }
//    }
//
//    class Medic extends noWeaponInfantry {
//        public Medic() {
//            super(60, 1);
//        }
//    }
//
//    abstract class Vehicle extends Unit {
//        int attack;
//        public Vehicle(int hp, int attack, int armor) {
//            super(hp, armor);
//            this.attack = attack;
//        }
//
//        void upgradeVehicleArmor(int uva) {
//            armor += uva;
//        }
//
//        void upgradeVehicleWeapon(int uvw) {
//            attack += uvw;
//        }
//    }
//
//    class Vulture extends Vehicle {
//        public Vulture(int hp, int attack,  int armor) {
//            super(80, 20, 0);
//        }
//    }
//
//    class ArcliteSiegeTank extends Vehicle {
//        public ArcliteSiegeTank(int hp, int attack, int armor) {
//            super(150,30,1);
//        }
//    }
//
//    class
//
//
//
//    public class Dropship {}
//}
