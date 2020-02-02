class Dog implements Comparable<Dog>{
	int size;
 
	Dog(int s) {
		size = s;
	}
 
	@Override
	public int compareTo(Dog o) {
		return o.size - this.size;
	}
        
        public String toString(){
            return "this dog is " + size + " pounds";
        }
}