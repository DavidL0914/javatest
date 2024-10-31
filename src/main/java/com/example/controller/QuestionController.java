package com.your_project.controller; // Update with your actual package name

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    public static class YourRequestBodyType {
        private String topic;
        private String requirements;

        // Getters and Setters
        public String getTopic() { return topic; }
        public void setTopic(String topic) { this.topic = topic; }

        public String getRequirements() { return requirements; }
        public void setRequirements(String requirements) { this.requirements = requirements; }
    }

    @CrossOrigin(origins = "http://127.0.0.1:4100") // Allow CORS for this endpoint
    @PostMapping("/generate/question")
    public ResponseEntity<?> generateQuestion(@RequestBody YourRequestBodyType request) {
        // Your logic for generating a question based on the request
        return ResponseEntity.ok("Generated question goes here"); // Replace with actual logic
    }
}
