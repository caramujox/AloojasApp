import 'package:mobx/mobx.dart';

part 'welcome_store.g.dart';

class WelcomeStore = _WelcomeStoreBase with _$WelcomeStore;
abstract class _WelcomeStoreBase with Store {

  @observable
  int value = 0;

  @action
  void increment() {
    value++;
  } 
}