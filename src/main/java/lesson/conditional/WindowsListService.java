package lesson.conditional;

import org.springframework.stereotype.Service;

@Service
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
