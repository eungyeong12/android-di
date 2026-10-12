package woowacourse.shopping.ui.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras

object ScreenEntryIdKey : CreationExtras.Key<String>

class CartScreenScopeViewModel(
    val dateFormatter: DateFormatter,
) : ViewModel()
