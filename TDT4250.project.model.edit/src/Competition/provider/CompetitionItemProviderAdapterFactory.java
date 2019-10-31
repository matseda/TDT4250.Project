/**
 */
package competition.provider;

import competition.util.CompetitionAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompetitionItemProviderAdapterFactory extends CompetitionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetitionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Competition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompetitionItemProvider competitionItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Competition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompetitionAdapter() {
		if (competitionItemProvider == null) {
			competitionItemProvider = new CompetitionItemProvider(this);
		}

		return competitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Season} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonItemProvider seasonItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeasonAdapter() {
		if (seasonItemProvider == null) {
			seasonItemProvider = new SeasonItemProvider(this);
		}

		return seasonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Team} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamItemProvider teamItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamAdapter() {
		if (teamItemProvider == null) {
			teamItemProvider = new TeamItemProvider(this);
		}

		return teamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Person} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonItemProvider personItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonAdapter() {
		if (personItemProvider == null) {
			personItemProvider = new PersonItemProvider(this);
		}

		return personItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Match} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchItemProvider matchItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchAdapter() {
		if (matchItemProvider == null) {
			matchItemProvider = new MatchItemProvider(this);
		}

		return matchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.MatchTeam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchTeamItemProvider matchTeamItemProvider;

	/**
	 * This creates an adapter for a {@link competition.MatchTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchTeamAdapter() {
		if (matchTeamItemProvider == null) {
			matchTeamItemProvider = new MatchTeamItemProvider(this);
		}

		return matchTeamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Score} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreItemProvider scoreItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScoreAdapter() {
		if (scoreItemProvider == null) {
			scoreItemProvider = new ScoreItemProvider(this);
		}

		return scoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Goal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalItemProvider goalItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoalAdapter() {
		if (goalItemProvider == null) {
			goalItemProvider = new GoalItemProvider(this);
		}

		return goalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Booking} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingItemProvider bookingItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBookingAdapter() {
		if (bookingItemProvider == null) {
			bookingItemProvider = new BookingItemProvider(this);
		}

		return bookingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link competition.Substitution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionItemProvider substitutionItemProvider;

	/**
	 * This creates an adapter for a {@link competition.Substitution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubstitutionAdapter() {
		if (substitutionItemProvider == null) {
			substitutionItemProvider = new SubstitutionItemProvider(this);
		}

		return substitutionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (competitionItemProvider != null) competitionItemProvider.dispose();
		if (seasonItemProvider != null) seasonItemProvider.dispose();
		if (teamItemProvider != null) teamItemProvider.dispose();
		if (personItemProvider != null) personItemProvider.dispose();
		if (matchItemProvider != null) matchItemProvider.dispose();
		if (matchTeamItemProvider != null) matchTeamItemProvider.dispose();
		if (scoreItemProvider != null) scoreItemProvider.dispose();
		if (goalItemProvider != null) goalItemProvider.dispose();
		if (bookingItemProvider != null) bookingItemProvider.dispose();
		if (substitutionItemProvider != null) substitutionItemProvider.dispose();
	}

}