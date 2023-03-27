package com.dong.Board.Controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dong.Board.Service.BoardService;
import com.dong.Board.entity.Board;
import com.dong.Board.entity.BoardView;

@RequestMapping("/customer/board")
@Controller
public class BoardController {

	@Autowired
	BoardService service;

	@RequestMapping("/list")
	public String list(Model model, @RequestParam(name = "p", required = false, defaultValue = "1") int page,
									@RequestParam(name = "f", required = false, defaultValue = "title")String field,
									@RequestParam(name = "q", required = false, defaultValue = "")String query) {


		List<BoardView> list = service.getViewList(page, field, query);
		int count = service.getCount(field, query);

		model.addAttribute("count", count);
		model.addAttribute("list", list);

		return "customer.board.list";
	}

	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int id) {

		BoardView detail = service.getView(id);
		model.addAttribute("detail", detail);

		return "customer.board.detail";
	}

	@GetMapping("/insertForm")
	public String insertForm() {
		return "customer.board.insertForm";
	}

	@PostMapping("/insert")
	public String insert(@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "memberId", required = false, defaultValue = "1") int memberId,
			@RequestParam(name = "content", required = false, defaultValue = "") String content) {

		Board board = new Board();
		board.setTitle(title);
		board.setMemberId(memberId);
		board.setContent(content);

		service.insert(board);

		return "redirect:list";
	}

	
	  @GetMapping("/updateForm/{id}") 
	  public String updateForm(@PathVariable int id, Model model) {
	  
	  model.addAttribute("board", service.getView(id));
		  
	  return "customer.board.update"; }
	 
	
	@PostMapping("/update/{id}")
	public String update(@PathVariable int id , Model model, BoardView boardView) {
		
		/*
		 * System.out.println("id :" + boardView.getId()); System.out.println("제목 :" +
		 * boardView.getTitle()); System.out.println("내용 :" + boardView.getContent());
		 */
		
		 BoardView boardTemp = service.getView(id);
		 
		 boardTemp.setTitle(boardView.getTitle());
		 boardTemp.setContent(boardView.getContent());
		 
		 service.update(boardTemp);
		
		return "redirect:/customer/board/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		service.delete(id);
		
		return "redirect:/customer/board/list";	
	}
}
