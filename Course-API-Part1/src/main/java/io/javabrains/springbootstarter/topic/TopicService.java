//SpringBoot QS 17


package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	// Creating member variable to create topics
	// Must declare variable as 'List' data type
	// With object type (Topic) inside to compile properly
	// 
	private List<Topic> topics = new ArrayList<>( Arrays.asList(
				new Topic("spring", "Spring Framework", "SpringFramework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "Essential JavaScript", "Essential JavaScript Description"),
				new Topic("front-end", "Front-End for Beginners", "Front-End Description")
				));
	
	//Create method to return all 'Topics'
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	// Create method to return specific topic that matches 'id' parameter
	// Will check every 'id' to see if parameter 'id' that was passed
	// If it matches any from the list
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	// Create method to add new instance of class 'Topic' 
	// To ArrayList 'topics'
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	// Create method to update an existing 'topic' resource
	// Will only execute  when request is 'PUT'
	// Loop will check if sent object matches any 'topic' inside 'topics' list
	// If object sent matches a 'Topic' it will update to changed details
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i <topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	//Created method to 'DELETE' an existing topic
	// Will only execute  when request is 'DELETE'
	// Loop will check if sent object matches any 'topic' inside 'topics' list
	// If object sent matches a 'Topic' it will remove the topic from the list
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	
	}
}

