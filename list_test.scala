def list_list_maxsize(lists:List[List[Int]]):Int = {
	lists.map(_.size).max
}

println(list_list_maxsize(List(List(3,1,4), List(2,7,1,8,2,8), List(0,5,7,7))))
