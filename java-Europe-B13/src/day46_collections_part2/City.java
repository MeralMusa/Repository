package day46_collections_part2;

public class City {

		// TODO Auto-generated method stub

		private String name;
	

		public City(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}
		

		
		//hashCode and equals methods are used to find if 2 objects are euqal

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			City other = (City) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		

		@Override
		public String toString() {
			return "City [name=" + name + "]";
		}
		
		
	
		

	}