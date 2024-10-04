package org.culture.heritage.controller;

import java.security.Principal;

import org.culture.heritage.model.UserDtls;
import org.culture.heritage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CitiesController {
	
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void getUserDetails(Principal p, Model m) {
		if (p != null) {
			String email = p.getName();
			UserDtls userDtls = userService.getUserByEmail(email);
			m.addAttribute("user", userDtls);
		}

		
	}
		
	

	@GetMapping("/agraCity")
	public String agraCity(){
		return "cities/serviceCity/Agra_City/index";
	}
	
	@GetMapping("/agraCity/history")
	public String agraHistory(){
		return "cities/serviceCity/Agra_City/history";
	}
	
	//Allahabad
	@GetMapping("/allahabadCity")
	public String allahabadCity(){
		return "cities/serviceCity/Allahabd_City/index";
	}
	
	@GetMapping("/allahabadCity/history")
	public String allhabadHistory(){
		return "cities/serviceCity/Allahabd_City/history";
	}
	
	@GetMapping("/allahabadCity/allahabadTransport")
	public String allhabadTransport(){
		return "cities/serviceCity/Allahabd_City/Allahabd_Transport/index";
	}
	
	@GetMapping("/allahabadCity/allahabadHotel")
	public String allhabadHotel(){
		return "cities/serviceCity/Allahabd_City/Hotels/allahabadHotel";
	}
	
	@GetMapping("/allahabadCity/allahabadRestaurant")
	public String allahabadRestaurant(){
		return "cities/serviceCity/Allahabd_City/Resturent1/index";
	}
	
	@GetMapping("/allahabadCity/akhileshwar")
	public String akhileshwar(){
		return "cities/serviceCity/Allahabd_City/Top_secret/akhileshwar";
	}
	
	@GetMapping("/allahabadCity/akshayVat")
	public String akshayVat(){
		return "cities/serviceCity/Allahabd_City/Top_secret/akshay_vat";
	}
	
	@GetMapping("/allahabadCity/allahabadfort")
	public String allfort(){
		return "cities/serviceCity/Allahabd_City/Top_secret/allfort";
	}
	
	@GetMapping("/allahabadCity/alopidevi")
	public String alopidevi(){
		return "cities/serviceCity/Allahabd_City/Top_secret/alopidevi";
	}
	
	@GetMapping("/allahabadCity/anandbhavan")
	public String annadbhavan(){
		return "cities/serviceCity/Allahabd_City/Top_secret/annadbhavan";
	}
	
	@GetMapping("/allahabadCity/ashokpiller")
	public String ashokpiller(){
		return "cities/serviceCity/Allahabd_City/Top_secret/ashokpiller";
	}
	
	@GetMapping("/allahabadCity/azadpark")
	public String azadpark(){
		return "cities/serviceCity/Allahabd_City/Top_secret/azadpark";
	}
	
	@GetMapping("/allahabadCity/civilhanuman")
	public String civilhanuman(){
		return "cities/serviceCity/Allahabd_City/Top_secret/civilhanuman";
	}
	
	@GetMapping("/allahabadCity/ganga")
	public String ganga(){
		return "cities/serviceCity/Allahabd_City/Top_secret/ganga";
	}
	
	@GetMapping("/allahabadCity/hanuman")
	public String hanuman(){
		return "cities/serviceCity/Allahabd_City/Top_secret/hanuman";
	}
	
	@GetMapping("/allahabadCity/highcourt")
	public String highcourt(){
		return "cities/serviceCity/Allahabd_City/Top_secret/highcourt";
	}
	
	@GetMapping("/allahabadCity/jain")
	public String jain(){
		return "cities/serviceCity/Allahabd_City/Top_secret/jain";
	}
	
	@GetMapping("/allahabadCity/kalyanidevi")
	public String kalyanidevi(){
		return "cities/serviceCity/Allahabd_City/Top_secret/kalyanidevi";
	}
	
	@GetMapping("/allahabadCity/khushrobag")
	public String khushrobag(){
		return "cities/serviceCity/Allahabd_City/Top_secret/khushrobag";
	}
	@GetMapping("/allahabadCity/mankameshwar")
	public String mankame(){
		return "cities/serviceCity/Allahabd_City/Top_secret/mankame";
	}
	
	@GetMapping("/allahabadCity/nagvasuki")
	public String nagvasuki(){
		return "cities/serviceCity/Allahabd_City/Top_secret/nagvasuki";
	}
	
	@GetMapping("/allahabadCity/triveniSangam")
	public String Triveni(){
		return "cities/serviceCity/Allahabd_City/Top_secret/Triveni";
	}
	
	@GetMapping("/allahabadCity/vimanmahadev")
	public String vimanmahadev(){
		return "cities/serviceCity/Allahabd_City/Top_secret/vimanmahadev";
	}
	
	
	
	//end allahabad
	
	@GetMapping("/ayodhyaCity")
	public String ayodhyaCity(){
		return "cities/serviceCity/Ayodhya_City/index";
	}
	
	@GetMapping("/ayodhyaCity/history")
	public String ayodhyaHistory(){
		return "cities/serviceCity/Ayodhya_City/history";
	}

	
	@GetMapping("/varanasiCity")
	public String varanasi(){
		return "cities/serviceCity/Banaras_city/index";
	}
	
	@GetMapping("/varanasiCity/history")
	public String varanasiHistory(){
		return "cities/serviceCity/Banaras_city/history";
	}
	
	@GetMapping("/sarnathCity")
	public String sarnathCity(){
		return "cities/serviceCity/Sarnath_City/index";
	}
	
	@GetMapping("/sarnathCity/history")
	public String sarnathHistory(){
		return "cities/serviceCity/Sarnath_City/history";
	}

	
	@GetMapping("/gorakhpurCity")
	public String gorakhpurCity(){
		return "cities/serviceCity/Gorakhpur_City/index";
	}
	@GetMapping("/gorakhpurCity/history")
	public String gorakhpurHistory(){
		return "cities/serviceCity/Gorakhpur_City/history";
	}
	
	
	@GetMapping("/haridwarCity")
	public String haridwarCity(){
		return "cities/serviceCity/Haridwar_City/index";
	}
	@GetMapping("/haridwarCity/history")
	public String haridwarHistory(){
		return "cities/serviceCity/Haridwar_City/history";
	}
	
	@GetMapping("/chitrakootCity")
	public String chitrakootCity(){
		return "cities/serviceCity/Chitracoot_City/index";
	}
	@GetMapping("/chitrakootCity/history")
	public String chitrakootHistory(){
		return "cities/serviceCity/Chitracoot_City/history";
	}
	
	@GetMapping("/chandigarhCity")
	public String chandigarhCity(){
		return "cities/serviceCity/Chandigarh_City/Chandigarh";
	}
	@GetMapping("/chandigarhCity/history")
	public String chandigarhHistory(){
		return "cities/serviceCity/Chandigarh_City/history";
	}
	
	@GetMapping("/chennaiCity")
	public String chennaiCity(){
		return "cities/serviceCity/Chenni_City/Chenni";
	}
	@GetMapping("/chennaiCity/history")
	public String chennaiHistory(){
		return "cities/serviceCity/Chenni_City/history";
	}
	
	@GetMapping("/delhiCity")
	public String delhiCity(){
		return "cities/serviceCity/delhi_city/Delhi";
	}
	@GetMapping("/delhiCity/history")
	public String delhiHistory(){
		return "cities/serviceCity/delhi_city/history";
	}
	
	@GetMapping("/jhansiCity")
	public String jhansiCity(){
		return "cities/serviceCity/Jhansi_city/Jhansi";
	}
	@GetMapping("/jhansiCity/history")
	public String jhansiHistory(){
		return "cities/serviceCity/Jhansi_city/history";
	}
	
	@GetMapping("/jaunpurCity")
	public String jaunpurCity(){
		return "cities/serviceCity/Jounpur_city/index";
	}
	@GetMapping("/jaunpurCity/history")
	public String jaunpurHistory(){
		return "cities/serviceCity/Jounpur_city/history";
	}
	
	@GetMapping("/kolkataCity")
	public String kolkataCity(){
		return "cities/serviceCity/Kolkata_City/index";
	}
	@GetMapping("/kolkataCity/history")
	public String kolkataHistory(){
		return "cities/serviceCity/Kolkata_City/history";
	}
	
	@GetMapping("/lucknowCity")
	public String lucknowCity(){
		return "cities/serviceCity/Lucknow_city/lucknow";
	}
	@GetMapping("/lucknowCity/history")
	public String lucknowHistory(){
		return "cities/serviceCity/Lucknow_city/history";
	}
	
	@GetMapping("/mathuraCity")
	public String mathuraCity(){
		return "cities/serviceCity/Mathura_City/Mathura";
	}
	@GetMapping("/mathuraCity/history")
	public String mathuraHistory(){
		return "cities/serviceCity/Mathura_City/history";
	}
	
	@GetMapping("/mumbaiCity")
	public String mumbaiCity(){
		return "cities/serviceCity/Mumbai_city/Mumbai";
	}
	@GetMapping("/mumbaiCity/history")
	public String mumbaiHistory(){
		return "cities/serviceCity/Mumbai_city/history";
	}
	
	@GetMapping("/odishaCity")
	public String odishaCity(){
		return "cities/serviceCity/Odisha_city/Odisha";
	}
	@GetMapping("/odishaCity/history")
	public String odishaHistory(){
		return "cities/serviceCity/Odisha_city/history";
	}
	
	@GetMapping("/patnaCity")
	public String patnaCity(){
		return "cities/serviceCity/Patna_city/index";
	}
	@GetMapping("/patnaCity/history")
	public String patnaHistory(){
		return "cities/serviceCity/Patna_city/history";
	}
	
	@GetMapping("/puneCity")
	public String puneCity(){
		return "cities/serviceCity/Pune_city/index";
	}
	@GetMapping("/puneCity/history")
	public String puneHistory(){
		return "cities/serviceCity/Pune_city/history";
	}
	
	@GetMapping("/ujjainCity")
	public String ujjainCity(){
		return "cities/serviceCity/Ujjain_city/ujjain";
	}
	@GetMapping("/ujjainCity/history")
	public String ujjainHistory(){
		return "cities/serviceCity/Ujjain_city/history";
	}

	
	
	
	
	
	
	
	
}
