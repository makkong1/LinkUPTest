package kh.link_up.controller;

import kh.link_up.domain.Board;
import kh.link_up.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public String list(Model model) {
        List<Board> boards = boardService.getAllBoards();
        model.addAttribute("boards", boards);
        return "board/list"; // Thymeleaf 템플릿 파일 경로
    }

    @RequestMapping(value={"/","/new"})
//    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("board", new Board());
        return "board/form"; // 게시글 작성 폼
    }

    @PostMapping("/save")
    public String create(Board board) {
        boardService.saveBoard(board);
        return "redirect:/board"; // 게시글 목록으로 리다이렉트
    }

    @GetMapping("/board/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Board board = boardService.getBoardById(id).orElse(null);
        model.addAttribute("board", board);
        return "board/view"; // 게시글 상세 보기
    }

    @PostMapping("/board/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
        return "redirect:/board"; // 게시글 목록으로 리다이렉트
    }
}
