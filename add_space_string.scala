def add_space_string(str:String):String = {
  var s = new StringBuilder
    for(i <- 0 until str.length){
      if(i!=0){
        s.append(" ")
      }
      s.append(str.charAt(i))	
    }
  return s.result
}

//mkStringを使えば楽だったっぽい・・・

println(add_space_string("また大阪か"))
