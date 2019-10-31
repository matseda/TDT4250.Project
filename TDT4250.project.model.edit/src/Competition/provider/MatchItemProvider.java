/**
 */
package competition.provider;


import competition.CompetitionFactory;
import competition.CompetitionPackage;
import competition.Match;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link competition.Match} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addUtcDatePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addMinutePropertyDescriptor(object);
			addAttendancePropertyDescriptor(object);
			addVenuePropertyDescriptor(object);
			addLastUpdatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_id_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Utc Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtcDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_utcDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_utcDate_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__UTC_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_status_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_minute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_minute_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__MINUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attendance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttendancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_attendance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_attendance_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__ATTENDANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Venue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVenuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_venue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_venue_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__VENUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Updated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastUpdatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_lastUpdated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_lastUpdated_feature", "_UI_Match_type"),
				 CompetitionPackage.Literals.MATCH__LAST_UPDATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__HOME_TEAM);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__AWAY_TEAM);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__SCORE);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__GOALS);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__BOOKINGS);
			childrenFeatures.add(CompetitionPackage.Literals.MATCH__SUBSTITUTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Match.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Match"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Match match = (Match)object;
		return getString("_UI_Match_type") + " " + match.getId();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Match.class)) {
			case CompetitionPackage.MATCH__ID:
			case CompetitionPackage.MATCH__UTC_DATE:
			case CompetitionPackage.MATCH__STATUS:
			case CompetitionPackage.MATCH__MINUTE:
			case CompetitionPackage.MATCH__ATTENDANCE:
			case CompetitionPackage.MATCH__VENUE:
			case CompetitionPackage.MATCH__LAST_UPDATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CompetitionPackage.MATCH__HOME_TEAM:
			case CompetitionPackage.MATCH__AWAY_TEAM:
			case CompetitionPackage.MATCH__SCORE:
			case CompetitionPackage.MATCH__GOALS:
			case CompetitionPackage.MATCH__BOOKINGS:
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__HOME_TEAM,
				 CompetitionFactory.eINSTANCE.createMatchTeam()));

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__AWAY_TEAM,
				 CompetitionFactory.eINSTANCE.createMatchTeam()));

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__SCORE,
				 CompetitionFactory.eINSTANCE.createScore()));

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__GOALS,
				 CompetitionFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__BOOKINGS,
				 CompetitionFactory.eINSTANCE.createBooking()));

		newChildDescriptors.add
			(createChildParameter
				(CompetitionPackage.Literals.MATCH__SUBSTITUTIONS,
				 CompetitionFactory.eINSTANCE.createSubstitution()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CompetitionPackage.Literals.MATCH__HOME_TEAM ||
			childFeature == CompetitionPackage.Literals.MATCH__AWAY_TEAM;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CompetitionEditPlugin.INSTANCE;
	}

}
