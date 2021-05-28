//hierarichal inheritance**//
//super class**//
Class Animals{
	eat()
	System.out.print("eating");
	move()
	System.out.print("moving");
}
//extend attributes(comment)**//
//sub class**// 
Class Dog extend Animal{
	bark()
	System.out.print("bow wow wow");
}
//sub class**//
Class Snake extend Animal{
	hiss()
	Sytem.out.print("hiss hiss hiss");
}
//sub class**//
Class Eagle extend Animal{
	acc()
	System.out.print("ak ak ak");
}
Public static void main (String[] args){
}
Dog d = new Dog();
//calling attributes**//
d.eat; 
d.move;
Snake d = new Snake();
//calling attributes**//
d.eat;
d.move;
Eagle d = new Eagle()41;
//calling attributes**//
d.eat;
d.move;