package com.hexaware.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrud.entities.Policy;
import java.util.List;


@Repository // optional annotion (jpa repo has this annotation already)
public interface PolicyRepository extends JpaRepository<Policy, Long> 
{
	public Policy   findByPolicyName(String policyName); 
	
	public List<Policy> findByPolicyType(String policyType);
	
	public List<Policy> findByPremiumGreaterThan(double premium);
	
	public List<Policy> findByPremiumLessThan(double premium); 

	
	//jpql query 
	// can use any method name when using customized query
	@Query("select p from Policy p where p.premium >?1 order by p.policyName")
	public List<Policy> getPoliciesSorted(double premium);
}
