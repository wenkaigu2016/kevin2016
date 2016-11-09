package demo.Controller;

import demo.Dao.AccountRepository;
import demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/10/31.
 */
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @ResponseBody
    @RequestMapping(value = "/queryAccounts", method = RequestMethod.GET)
    public Account queryAccounts(@RequestParam(value = "accountId")Integer accountId)
    {
        return accountRepository.findById(accountId);
    }
}
