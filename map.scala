def map_test(){
	val map = Map(1->10,2->20)
	map.foreach{
		case(k,v) => println(k+":"+v)
	}
}
map_test()
