package ORM;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept);
	void update(Dept dept);
	void delete(Integer deptno);
	
	Dept findByDeptno(Integer deptno); // 以部門當作回傳型別，只會傳入一筆資料，因為部門編號是主鍵只有唯一，用來查一筆資料
	List<Dept> getAll(); // 集合有排序性，且可對應不同數量
}
