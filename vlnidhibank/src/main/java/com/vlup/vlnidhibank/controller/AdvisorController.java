package com.vlup.vlnidhibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.BankingApp.DTO.AdvisorDTO;
import com.BankingApp.DTO.ApiResponse;
import com.BankingApp.services.AdvisorService;

@RestController
@RequestMapping("api/advisor")
public class AdvisorController {

	@Autowired
    private AdvisorService advisorService;
	
	  @GetMapping														//GET MAPPING
	    public ResponseEntity<List<AdvisorDTO>> getAllAdvisors() {
	       
	        return ResponseEntity.ok(this.advisorService.getAllAdvisors());
	    }

	    @GetMapping("/{advisorCode}")										//GET BY ID MAPPING
	    public ResponseEntity<AdvisorDTO> getAdvisorById(@PathVariable Integer advisorCode) {
	        
	        return ResponseEntity.ok(this.advisorService.getAdvisorById(advisorCode));
	    }

	    @PostMapping													//CREATE ADVISOR MAPPING
	    public ResponseEntity<AdvisorDTO> createAdvisor(@RequestBody AdvisorDTO advisorDTO) {
	        AdvisorDTO createdAdvisor = advisorService.createAdvisor(advisorDTO);
	        return new ResponseEntity<>(createdAdvisor, HttpStatus.CREATED);
	    }

	    @PutMapping("/{advisorCode}")									//UPDATE MAPPING
	    public ResponseEntity<AdvisorDTO> updateAdvisor(@PathVariable Integer advisorCode, @RequestBody AdvisorDTO advisorDTO) {
	        AdvisorDTO updatedAdvisor = advisorService.updateAdvisor(advisorDTO, advisorCode);
	        return new ResponseEntity<>(updatedAdvisor, HttpStatus.OK);
	    }

	    @DeleteMapping("/{advisorCode}")								//DELETE MAPPING
	    public ResponseEntity<ApiResponse> deleteAdvisor(@PathVariable Integer advisorCode) {
	        this.advisorService.deleteAdvisor(advisorCode);
	        return new ResponseEntity<ApiResponse>(new ApiResponse("Advisor Deleted successfully...",true),HttpStatus.OK);
	    }
	    
	    @PostMapping("/uploadPhoto/{advisorCode}")
	    public ResponseEntity<String> uploadPhoto(@PathVariable Integer advisorCode, @RequestParam("file") MultipartFile file) {
	        // Logic to handle file upload for advisor photo
	        // Save file to storage (e.g., disk, cloud)
	        // Update advisor entity with new photo URL
	        return ResponseEntity.ok("Photo uploaded successfully for advisor with code: " + advisorCode);
	    }

	    @PostMapping("/uploadSignature/{advisorCode}")
	    public ResponseEntity<String> uploadSignature(@PathVariable Integer advisorCode, @RequestParam("file") MultipartFile file) {
	        // Logic to handle file upload for advisor signature
	        // Save file to storage (e.g., disk, cloud)
	        // Update advisor entity with new signature URL
	        return ResponseEntity.ok("Signature uploaded successfully for advisor with code: " + advisorCode);
    }

}