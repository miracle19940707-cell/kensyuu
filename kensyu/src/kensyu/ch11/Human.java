package kensyu.ch11;
import kensyu.ch11.Creature_3.Creature;
//インターフェースを継承する
public interface Human extends Creature {
   void talk();
   void watch();
   void hear();
//さらに親フェーズから継承する
}