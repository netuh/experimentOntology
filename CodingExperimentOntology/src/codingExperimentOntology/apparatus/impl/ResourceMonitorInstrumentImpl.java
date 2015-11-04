/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.CodingArtifact;
import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.ResourceMonitorInstrument;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Monitor Instrument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl#isCreation <em>Creation</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl#isModification <em>Modification</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.impl.ResourceMonitorInstrumentImpl#isDelete <em>Delete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMonitorInstrumentImpl extends CodingInstrumentImpl implements ResourceMonitorInstrument {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingArtifact> target;

	/**
	 * The default value of the '{@link #isCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean creation = CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModification()
	 * @generated
	 * @ordered
	 */
	protected boolean modification = MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceMonitorInstrumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.RESOURCE_MONITOR_INSTRUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingArtifact> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<CodingArtifact>(CodingArtifact.class, this, NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreation(boolean newCreation) {
		boolean oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__CREATION, oldCreation, creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModification(boolean newModification) {
		boolean oldModification = modification;
		modification = newModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(boolean newDelete) {
		boolean oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__TARGET:
				return getTarget();
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__CREATION:
				return isCreation();
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__MODIFICATION:
				return isModification();
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__DELETE:
				return isDelete();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends CodingArtifact>)newValue);
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__CREATION:
				setCreation((Boolean)newValue);
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__MODIFICATION:
				setModification((Boolean)newValue);
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__DELETE:
				setDelete((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__TARGET:
				getTarget().clear();
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__CREATION:
				setCreation(CREATION_EDEFAULT);
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__DELETE:
				setDelete(DELETE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__TARGET:
				return target != null && !target.isEmpty();
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__CREATION:
				return creation != CREATION_EDEFAULT;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__MODIFICATION:
				return modification != MODIFICATION_EDEFAULT;
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT__DELETE:
				return delete != DELETE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (creation: ");
		result.append(creation);
		result.append(", modification: ");
		result.append(modification);
		result.append(", delete: ");
		result.append(delete);
		result.append(')');
		return result.toString();
	}

} //ResourceMonitorInstrumentImpl
