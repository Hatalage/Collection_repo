package com.labPrograms;

public class Department {
	
		
		private int deptId;
		private String deptName;
			
		public Department() {
			super();
		}


		public Department(int deptId, String deptName) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			
		}


		public int getDeptId() {
			return deptId;
		}


		public String getDeptName() {
			return deptName;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}


		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}


		@Override
		public String toString() {
			return "deptId=" + deptId + ", deptName=" + deptName ;
		}
		
		
		

	}

