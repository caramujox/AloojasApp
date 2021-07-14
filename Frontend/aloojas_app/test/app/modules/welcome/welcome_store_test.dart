import 'package:flutter_test/flutter_test.dart';
import 'package:aloojas_app/app/modules/welcome/welcome_store.dart';
 
void main() {
  late WelcomeStore store;

  setUpAll(() {
    store = WelcomeStore();
  });

  test('increment count', () async {
    expect(store.value, equals(0));
    store.increment();
    expect(store.value, equals(1));
  });
}