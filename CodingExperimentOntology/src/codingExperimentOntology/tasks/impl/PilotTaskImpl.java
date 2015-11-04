/**
 */
package codingExperimentOntology.tasks.impl;

import codingExperimentOntology.apparatus.CodingArtifact;

import codingExperimentOntology.tasks.CodingTaskTypes;
import codingExperimentOntology.tasks.ConventionalCodingTask;
import codingExperimentOntology.tasks.NewPackage2Package;
import codingExperimentOntology.tasks.PilotTask;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pilot Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.tasks.impl.PilotTaskImpl#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link codingExperimentOntology.tasks.impl.PilotTaskImpl#getRequiredArtifact <em>Required Artifact</em>}</li>
 *   <li>{@link codingExperimentOntology.tasks.impl.PilotTaskImpl#getProducedArtifact <em>Produced Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PilotTaskImpl extends CodingPreTaskImpl implements PilotTask {
	/**
	 * The default value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected static final CodingTaskTypes TASK_TYPE_EDEFAULT = CodingTaskTypes.WRITING;

	/**
	 * The cached value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskType()
	 * @generated
	 * @ordered
	 */
	protected CodingTaskTypes taskType = TASK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredArtifact() <em>Required Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingArtifact> requiredArtifact;

	/**
	 * The cached value of the '{@link #getProducedArtifact() <em>Produced Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingArtifact> producedArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PilotTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage2Package.Literals.PILOT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingTaskTypes getTaskType() {
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskType(CodingTaskTypes newTaskType) {
		CodingTaskTypes oldTaskType = taskType;
		taskType = newTaskType == null ? TASK_TYPE_EDEFAULT : newTaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage2Package.PILOT_TASK__TASK_TYPE, oldTaskType, taskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingArtifact> getRequiredArtifact() {
		if (requiredArtifact == null) {
			requiredArtifact = new EObjectResolvingEList<CodingArtifact>(CodingArtifact.class, this, NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT);
		}
		return requiredArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingArtifact> getProducedArtifact() {
		if (producedArtifact == null) {
			producedArtifact = new EObjectResolvingEList<CodingArtifact>(CodingArtifact.class, this, NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT);
		}
		return producedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage2Package.PILOT_TASK__TASK_TYPE:
				return getTaskType();
			case NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT:
				return getRequiredArtifact();
			case NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT:
				return getProducedArtifact();
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
			case NewPackage2Package.PILOT_TASK__TASK_TYPE:
				setTaskType((CodingTaskTypes)newValue);
				return;
			case NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT:
				getRequiredArtifact().clear();
				getRequiredArtifact().addAll((Collection<? extends CodingArtifact>)newValue);
				return;
			case NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT:
				getProducedArtifact().clear();
				getProducedArtifact().addAll((Collection<? extends CodingArtifact>)newValue);
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
			case NewPackage2Package.PILOT_TASK__TASK_TYPE:
				setTaskType(TASK_TYPE_EDEFAULT);
				return;
			case NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT:
				getRequiredArtifact().clear();
				return;
			case NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT:
				getProducedArtifact().clear();
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
			case NewPackage2Package.PILOT_TASK__TASK_TYPE:
				return taskType != TASK_TYPE_EDEFAULT;
			case NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT:
				return requiredArtifact != null && !requiredArtifact.isEmpty();
			case NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT:
				return producedArtifact != null && !producedArtifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConventionalCodingTask.class) {
			switch (derivedFeatureID) {
				case NewPackage2Package.PILOT_TASK__TASK_TYPE: return NewPackage2Package.CONVENTIONAL_CODING_TASK__TASK_TYPE;
				case NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT: return NewPackage2Package.CONVENTIONAL_CODING_TASK__REQUIRED_ARTIFACT;
				case NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT: return NewPackage2Package.CONVENTIONAL_CODING_TASK__PRODUCED_ARTIFACT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConventionalCodingTask.class) {
			switch (baseFeatureID) {
				case NewPackage2Package.CONVENTIONAL_CODING_TASK__TASK_TYPE: return NewPackage2Package.PILOT_TASK__TASK_TYPE;
				case NewPackage2Package.CONVENTIONAL_CODING_TASK__REQUIRED_ARTIFACT: return NewPackage2Package.PILOT_TASK__REQUIRED_ARTIFACT;
				case NewPackage2Package.CONVENTIONAL_CODING_TASK__PRODUCED_ARTIFACT: return NewPackage2Package.PILOT_TASK__PRODUCED_ARTIFACT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (taskType: ");
		result.append(taskType);
		result.append(')');
		return result.toString();
	}

} //PilotTaskImpl
