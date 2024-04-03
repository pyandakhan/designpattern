public class demoMain{
    public static void main(String[] args) {
        System.out.println("------------This is Singleton Example 1--------------");
        Singleton.getInstance().setValue(42);
        System.out.println("value=" + Singleton.getInstance().getValue());
        System.out.println("------------This is Singleton Exampl2 2--------------");
        Singleton2.get().setValue(42);
        System.out.println("value=" + Singleton2.get().getValue());
        Singleton2.destruct();
        System.out.println("------------This is Singleton Example 3--------------");
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        boolean areSame = (singleton1 == singleton2);
        System.out.println("Are the instances the same? \n" + areSame);
        System.out.println("----------------Github Question 1--------------------");
        Connection c = Connection.getInstance();
		c.getData();
        System.out.println("----------------Github Question 2--------------------");
        Configuration config = Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));
        
    }

}
