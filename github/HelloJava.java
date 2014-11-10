class HelloJava{
    public static void main(String[] args){
	HelloJavaObject app1=new HelloJavaObject();
	HelloJavaObject app2=new HelloJavaObject();
	int num=Integer.parseInt(args[0]);
	for(int i=0;i<num;i++){
	    app1.sayHello();
	    app2.sayHello();
	}
    }
}