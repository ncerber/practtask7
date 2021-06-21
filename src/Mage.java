public class Mage {
    private String name, type;
    private int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.damage = damage;
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + "," + type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

//    fire, ice, earth
    public String fight(Mage mage){
        String winMage = "draw";
        System.out.println("this:" + this.getInfo());
        System.out.println("mage:" + mage.getInfo());

        if(this.type.equals(mage.getType())){
            if(this.level>mage.getLevel()){
                winMage = this.name;
            } else if (this.level<mage.getLevel()){
                winMage = mage.getName();
            }

            if(this.damage>mage.getDamage()) {
                winMage = this.name;
            } else if(this.damage<mage.getDamage()){
                winMage = mage.getName();
            }
        } else {
            if("fire".equals(this.type)){
                if("ice".equals(mage.getType())){
                    winMage = this.name;
                } else {
                    winMage = mage.getName();
                }
            } else if ("ice".equals(this.type)){
                if("earth".equals(mage.getType())){
                    winMage = this.name;
                } else {
                    winMage = mage.getName();
                }
            }else if("earth".equals(this.type)){
                if("fire".equals(mage.getType())){
                    winMage = this.name;
                } else {
                    winMage = mage.getName();
                }
            }
        }
        System.out.println("winMage:"+winMage);
        return winMage;
    }
}
