package com.example.delivery.app;

import com.example.delivery.app.Enum.Category;
import com.example.delivery.app.Model.Item;
import com.example.delivery.app.Repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@AllArgsConstructor
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private ItemRepository itemRepository;


    @Override
    public void run(String... args) throws Exception {
        setItems();
    }

    public void setItems() {
        if(itemRepository.findAll().isEmpty()) {
            List<Item> items = List.of(
                    new Item("Панчан ассорти", "Кимчи, жареные анчоусы с перцем чили", Category.SALAD, 380, "/images/dish1.png"),
                    new Item("Тофу с овощами", "Тофу, древесные грибы, острый соус", Category.SALAD, 510, "/images/dish2.jpg"),
                    new Item("Манду Тигим", "Пельмени во фритюре, фарш из говядины и свинины", Category.SALAD, 560, "/images/dish3.png"),
                    new Item("Рамён", "Острая лапша с яйцом, вешенками.", Category.SOUP, 570, "/images/dish4.jpg"),
                    new Item("Кукси", "Пшеничная лапша с кусочками говядины", Category.SOUP, 590, "/images/dish5.jpg"),
                    new Item("Кимба", "Нори, рис для суши, яичный омлет", Category.SUSHI, 350, "/images/dish7.jpg"),
                    new Item("Калифорния", "Нори, рис для суши, лосось", Category.SUSHI, 490, "/images/dish8.jpg"),
                    new Item("Меун Чокпаль", "Свиная рулька в остром соусе", Category.PORK, 1200, "/images/dish9.jpg"),
                    new Item("Чеюк Покым", "Жареный бекон с морковью, болгарским перцем", Category.PORK, 770, "/images/dish10.png"),
                    new Item("Пульгоги", "Говядина, маринованная в сладком грушевом соусе", Category.BEEF, 870, "/images/dish11.png"),
                    new Item("Тубу кимчи", "Премиальная говядина с кимчи, тофу", Category.BEEF, 950, "/images/dish12.png"),
                    new Item("Канпонги", "Филе куриного бедра в кисло-сладком соусе", Category.CHICKEN, 650, "/images/dish13.png"),
                    new Item("Курица с ананасом", "Курица, ананас, кисло-сладкий соус", Category.CHICKEN, 690, "/images/dish14.png"),
                    new Item("Лапша с курицей", "Домашняя лапша с курицей игрибами", Category.KOREAN_NOODLES, 580, "/images/dish15.png"),
                    new Item("Чачжа Мён", "Лапша с соевым соусом, беконом, яйцом", Category.KOREAN_NOODLES, 630, "/images/dish16.png"),
                    new Item("Альпаб", "Креветки и угорь с рисом, листьями салата", Category.DISHES_WITH_RICE, 650, "/images/dish17.png"),
                    new Item("Тольсот пибимпаб", "Горячий рис c говядиной", Category.DISHES_WITH_RICE, 650, "/images/dish18.png"),
                    new Item("Чано гуи", "Копчёный угорь с дольками чеснока и соусом терияки", Category.SEA_FOOD, 1380, "/images/dish19.png"),
                    new Item("Пальган", "Авторский десерт из мендальной муки", Category.DESSERT, 390, "/images/dish20.jpg"),
                    new Item("Чапсаль ток", "Корейский десерт со сладкой фасолью", Category.DESSERT, 280, "/images/dish21.jpg"),
                    new Item("Лимонад лайм", "Дольки лайма, мята, содовая, сахарный сироп", Category.DRINKS, 610, "/images/dish22.jpg"),
                    new Item("Тархун", "Эстрагон, сироп тархун, содовая, лимон", Category.DRINKS, 610, "/images/dish24.jpg")
            );
            itemRepository.saveAll(items);
        }

    }
}
