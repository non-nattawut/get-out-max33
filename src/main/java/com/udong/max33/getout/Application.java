package com.udong.max33.getout;

import net.codebox.homoglyph.Homoglyph;
import net.codebox.homoglyph.HomoglyphBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		List<String> digits = List.of("3","Ʒ","Ȝ","З","Ӡ","Ⳍ","Ꝫ","Ɜ","３","𖼻","𝈆","𝟑","𝟛","𝟥","𝟯","𝟹","𝔷","𝖟","ȝ","ʒ","ӡ","ჳ","ⳍ","ꝫ","Ǝ","∃","ⴺ","ꓱ","ɜ","з","ᴈ");
		List<String> mAlphabets = List.of("M","Μ","Ϻ","М","Ꮇ","ᗰ","ᛖ","ℳ","Ⅿ","Ⲙ","ꓟ","Ｍ","𐊰","𐌑","𝐌","𝑀","𝑴","𝓜","𝔐","𝕄","𝕸","𝖬","𝗠","𝘔","𝙈","𝙼","𝚳","𝛭","𝜧","𝝡","𝞛","m","ｍ","ʍ","м","ᴍ","ꮇ");
		List<String> aAlphabets = List.of("A","Α","А","Ꭺ","ᗅ","ᴀ","ꓮ","ꭺ","Ａ","𐊠","𖽀","𝐀","𝐴","𝑨","𝒜","𝓐","𝔸","𝖠","𝗔","𝘈","𝘼","𝙰","𝚨","𝛢","𝜜","𝝖","𝞐","a","ɑ","α","а","ａ","𝐚","𝑎","𝒂","𝒶","𝓪","𝔞","𝕒","𝖆","𝖺","𝗮","𝘢","𝙖","𝚊","Ä","Ӓ","Å","Ȧ","ä","ӓ","å","ȧ","Ă","Ǎ","ă","ǎ");
		List<String> xAlphabets = List.of("X","Χ","Х","᙭","ᚷ","Ⅹ","╳","Ⲭ","ⵝ","ꓫ","Ꭓ","Ｘ","𐊐","𐊴","𐌗","𐌢","𐔧","𑣬","𝐗","𝑋","𝑿","𝒳","𝓧","𝔛","𝕏","𝖃","𝖷","𝗫","𝘟","𝙓","𝚇","𝚾","𝛸","𝜲","𝝬","𝞦","x","×","х","ᕁ","ᕽ","᙮","ⅹ","⤫","⤬","⨯","ｘ","𝐱","𝑥","𝒙","𝓍","𝔁","𝔵","𝕩","𝖝","𝗑","𝘅","𝘹","𝙭","𝚡","χ","ⲭ","ꭓ","ꭕ","𝛘","𝜒","𝝌","𝞆","𝟀");

		Set<String> max33 = new HashSet<>();
		int stillRunning = 0;

		try(FileWriter writer = new FileWriter("max33.txt",true)) {
			for (String a : aAlphabets){
				for (String x : xAlphabets){
					for (String digit : digits){
						max33.add(a + x + digit);
					}
				}
				//System.out.println("Write : " + max33);
				System.out.println("STILL RUNNING : " + stillRunning);
				writer.write(max33.toString().replace("[", "").replace("]", "") + ",\n");
				max33 = new HashSet<>();
				stillRunning += 1;
			}
		} catch (Exception e){
			System.out.println("WHY??");
			e.printStackTrace();
		}

	}

}
