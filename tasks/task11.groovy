def gstring(def str, def num) {
   	return "1(${ -> num == 1 ? str : ''}) 2(${ -> num == 2 ? str : ''}) 3(${ -> num == 3 ? str : ''})"
}

return this