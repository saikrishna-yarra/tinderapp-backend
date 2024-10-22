package com.project.tinder_ai_backend;

import com.project.tinder_ai_backend.conversations.ChatMessage;
import com.project.tinder_ai_backend.conversations.Conversation;
import com.project.tinder_ai_backend.conversations.ConversationRepository;
import com.project.tinder_ai_backend.profiles.Gender;
import com.project.tinder_ai_backend.profiles.Profile;
import com.project.tinder_ai_backend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootApplication
public class TinderAiBackendApplication implements CommandLineRunner {

	@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private ConversationRepository conversationRepository ;

	public static void main(String[] args) {

		SpringApplication.run(TinderAiBackendApplication.class, args);
	}

	public void run(String... args) {
		Profile profile  = new Profile(
				"i",
				"Krishna",
				"Yarra",
				28,
				"Indian",
				Gender.MALE,
				"Software Engineer",
				"foo.jpg",
				"NA"
		);
		profileRepository.save(profile);
		profileRepository.findAll().forEach(System.out::println);

		Conversation conversation = new Conversation(
				"1",
				profile.id(),
				List.of(
						new ChatMessage("Hello", profile.id(), LocalDateTime.now())
				)
		);
		conversationRepository.save(conversation);
		conversationRepository.findAll().forEach(System.out::println);
	}

}
