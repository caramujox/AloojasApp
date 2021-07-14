
import 'package:aloojas_app/app/modules/home/home_store.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:triple_test/triple_test.dart';

void main() {
  final store = HomeStore();
  storeTest<HomeStore>("",
      build: () => HomeStore(),
      act: (store) => store.increment(),
      expect: () => [0, 1],
      );
}
