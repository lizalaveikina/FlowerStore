package flower.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@ToString
public class FlowerBucket {
    private List<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        return bucket.stream().mapToDouble(FlowerPack::getPrice).sum();
    }
}
